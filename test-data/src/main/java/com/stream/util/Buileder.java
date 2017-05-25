package com.stream.util;

import com.stream.order.Event;
import com.yjf.common.id.GID;
import com.yjf.common.id.OID;
import com.yjf.common.util.RandomStringUtils;

/**
 * Created by alpha on 2017/5/24.
 */
public class Buileder {
    public static Event buildEvent(){
        String bankCardAccount = Constant.BANKCARD_PRIFIX + RandomStringUtils.random(5, RandomStringUtils.NUMERIC_CHARS_STR);
        String userId = Constant.USERID_PRIFIX + RandomStringUtils.random(5, RandomStringUtils.NUMERIC_CHARS_STR);
        String partyUserId = Constant.USERID_PRIFIX + RandomStringUtils.random(5, RandomStringUtils.NUMERIC_CHARS_STR);

        Event event = new Event();
        event.setGid(GID.newGID());
        event.setBizNo(OID.newID());
        event.setOutBizNo(OID.newID());
        event.setBankAccountNo(bankCardAccount);
        event.setCounterPartyUserId(partyUserId);
        event.setUserId(userId);

        return event;
    }
}