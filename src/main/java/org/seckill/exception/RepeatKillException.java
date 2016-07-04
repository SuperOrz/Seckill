package org.seckill.exception;

/**
 * Created by hzzhouxin3 on 2016/6/29.
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
