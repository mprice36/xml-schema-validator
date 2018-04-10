package org.gtri.niem.xml_schema_validator;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;

public class NOPEntityResolver implements org.xml.sax.ext.EntityResolver2 {
    public InputSource getExternalSubset(String name, String baseURI) throws SAXException, IOException {
        return null;
    }

    public InputSource resolveEntity(String name, String publicId, String baseURI, String systemId)
            throws SAXException, IOException
    {
        return null;
    }

    public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
        return null;
    }
}
