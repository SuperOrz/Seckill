package org.seckill.exception;

/**
 * Created by hzzhouxin3 on 2016/6/29.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
