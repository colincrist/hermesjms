//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.03 at 11:55:46 GMT 
//


package hermes.config.impl;

public class JDBCStoreImpl implements hermes.config.JDBCStore, com.sun.xml.bind.JAXBObject, hermes.config.impl.runtime.UnmarshallableObject, hermes.config.impl.runtime.XMLSerializable, hermes.config.impl.runtime.ValidatableObject
{

    protected java.lang.String _Driver;
    protected java.lang.String _Url;
    protected java.lang.String _Alias;
    public final static java.lang.Class version = (hermes.config.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (hermes.config.JDBCStore.class);
    }

    public java.lang.String getDriver() {
        return _Driver;
    }

    public void setDriver(java.lang.String value) {
        _Driver = value;
    }

    public java.lang.String getUrl() {
        return _Url;
    }

    public void setUrl(java.lang.String value) {
        _Url = value;
    }

    public java.lang.String getAlias() {
        return _Alias;
    }

    public void setAlias(java.lang.String value) {
        _Alias = value;
    }

    public hermes.config.impl.runtime.UnmarshallingEventHandler createUnmarshaller(hermes.config.impl.runtime.UnmarshallingContext context) {
        return new hermes.config.impl.JDBCStoreImpl.Unmarshaller(context);
    }

    public void serializeBody(hermes.config.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributes(hermes.config.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Alias!= null) {
            context.startAttribute("", "alias");
            try {
                context.text(((java.lang.String) _Alias), "Alias");
            } catch (java.lang.Exception e) {
                hermes.config.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Driver!= null) {
            context.startAttribute("", "driver");
            try {
                context.text(((java.lang.String) _Driver), "Driver");
            } catch (java.lang.Exception e) {
                hermes.config.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Url!= null) {
            context.startAttribute("", "url");
            try {
                context.text(((java.lang.String) _Url), "Url");
            } catch (java.lang.Exception e) {
                hermes.config.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
    }

    public void serializeURIs(hermes.config.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (hermes.config.JDBCStore.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameCl"
+"ass;xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0003ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAt"
+"omicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0016L\u0000\n"
+"whiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;x"
+"pt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv"
+".datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com"
+".sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000c"
+"om.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq"
+"\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000\u0016L\u0000\fnamespaceURIq\u0000~\u0000\u0016xpq\u0000~\u0000\u001aq\u0000~\u0000\u0019sr\u0000#com.sun.msv.grammar"
+".SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fnamespaceURIq"
+"\u0000~\u0000\u0016xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0005aliast\u0000"
+"\u0000sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\f\u0001psq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpq\u0000~\u0000\u0011sq\u0000~\u0000\"t\u0000\u0006driverq\u0000"
+"~\u0000&q\u0000~\u0000(sq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpq\u0000~\u0000\u0011sq\u0000~\u0000\"t\u0000\u0003urlq\u0000~\u0000&q\u0000~\u0000(sr\u0000\"c"
+"om.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lc"
+"om/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.m"
+"sv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rst"
+"reamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;x"
+"p\u0000\u0000\u0000\u0005\u0001pq\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000*q\u0000~\u0000.q\u0000~\u0000\bx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends hermes.config.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(hermes.config.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(hermes.config.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return hermes.config.impl.JDBCStoreImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        attIdx = context.getAttribute("", "url");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "driver");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "alias");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Url = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Driver = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Alias = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        attIdx = context.getAttribute("", "url");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "driver");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "alias");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        if (("url" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        if (("driver" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        if (("alias" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        attIdx = context.getAttribute("", "url");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  8 :
                        if (("url" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("driver" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "driver");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "alias");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("alias" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  6 :
                            attIdx = context.getAttribute("", "url");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 9;
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  1 :
                            eatText3(value);
                            state = 2;
                            return ;
                        case  4 :
                            eatText2(value);
                            state = 5;
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "driver");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 6;
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("", "alias");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                        case  7 :
                            eatText1(value);
                            state = 8;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}