package org.yzy.math;

import java.io.Serializable;

/**
 * Created by yangzhiyue on 17/7/15.
 */
public interface Matrix<E> extends Serializable {
    /*
        getDimension()
        get the dimension of a matrix
     */

    public static final String TYPE = "MATRIX";

    public abstract int getDimension();

    //public abstract int getRank();

    public abstract E getDeterminant();


}
