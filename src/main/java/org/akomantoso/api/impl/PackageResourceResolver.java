package org.akomantoso.api.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

/**
 * Stream the required / imported dtd and schemas via a Resource Resolver
 * Otherwise it may require a internet lookup for these resources
 * The imported dtd / schemas are packaged in the library within :
 * org.akomantoso.api.impl 
 * @author Ashok Hariharan
 */
public class PackageResourceResolver implements LSResourceResolver {

    public static final String RESOURCE_PREFIX = 
            "/" + PackageResourceResolver.class.getPackage().getName().replace(".", "/");
    
    @Override
    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
        LSInputImpl impl = new LSInputImpl();
        // systemId 
        InputStream in = getClass().getResourceAsStream(RESOURCE_PREFIX + "/" + systemId);
        InputStreamReader inr = new InputStreamReader(in);
        impl.setPublicId(publicId);
        impl.setSystemId(systemId);
        impl.setBaseURI(baseURI);
        impl.setCharacterStream(inr);
        return impl;
    }
    
}
