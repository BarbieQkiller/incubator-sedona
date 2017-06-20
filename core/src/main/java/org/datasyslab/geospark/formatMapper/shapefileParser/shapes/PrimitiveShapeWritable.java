package org.datasyslab.geospark.formatMapper.shapefileParser.shapes;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Writable;
import org.datasyslab.geospark.formatMapper.shapefileParser.parseUtils.shp.ShapeType;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zongsizhang on 6/1/17.
 */
public class PrimitiveShapeWritable implements Writable{

    /** primitive bytes of one record */
    private BytesWritable primitiveRecord = null;

    /** primitive bytes from one record */
    private BytesWritable primitiveAttribute = null;

    /** shape type */
    ShapeType shapeType = ShapeType.NULL;

    public BytesWritable getPrimitiveRecord() {
        return primitiveRecord;
    }

    public void setPrimitiveRecord(BytesWritable primitiveRecord) {
        this.primitiveRecord = primitiveRecord;
    }


    public void write(DataOutput dataOutput) throws IOException {

    }

    public BytesWritable getPrimitiveAttribute() {
        return primitiveAttribute;
    }

    public void setPrimitiveAttribute(BytesWritable primitiveAttribute) {
        this.primitiveAttribute = primitiveAttribute;
    }

    public void readFields(DataInput dataInput) throws IOException {

    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
