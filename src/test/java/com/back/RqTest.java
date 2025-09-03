package com.back;

public class RqTest {

    @Test
    @Displayname("getActionName")
    void t1(){
        Rq rq = new Rq("삭제?id=1");
        String actionName = rq.getActionName(); //삭제

        assertThat(actionName).isEqualTo("삭제");

    }
}
