package ca.fuwafuwa.kaku.XmlParsers.Interfaces;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by 0x1bad1d3a on 12/1/2016.
 */

public interface DictParser {
    void parseDict(XmlPullParser parser) throws IOException, XmlPullParserException, SQLException;
}
