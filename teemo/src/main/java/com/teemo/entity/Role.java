/**
 * Copyright (c) 2016- https://github.com/beiyoufx
 *
 * Licensed under the GPL-3.0
 */
package com.teemo.entity;

import com.alibaba.fastjson.annotation.JSONType;
import com.teemo.core.entity.BaseEntity;

import javax.persistence.*;

/**
 * @author yongjie.teng
 * @version 1.0
 * @date 16-10-21
 * @email yongjie.teng@foxmail.com
 * @package com.teemo.entity
 * @project teemo
 */
@Entity
@Table(name = "role")
@JSONType(orders = {"id", "roleKey", "roleValue", "description"})
public class Role extends BaseEntity {
    private static final long serialVersionUID = -367123952261959248L;
    /**
     * 自增主键
     */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    /**
     * 角色key
     */
    @Column(name = "role_key", length = 32, nullable = false, unique = true)
    private String roleKey;

    /**
     * 角色名称
     */
    @Column(name = "role_value", length = 32, nullable = false)
    private String roleValue;

    /**
     * 角色描述
     */
    @Column(name = "description", length = 128)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
