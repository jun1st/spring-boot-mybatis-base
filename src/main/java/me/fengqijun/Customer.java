package me.fengqijun;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by fengqijun on 25/11/2017.
 */

@Getter
@Setter
@NoArgsConstructor
public class Customer implements Serializable {

    private long id;
    private String name, telephone, email, remark;
}
