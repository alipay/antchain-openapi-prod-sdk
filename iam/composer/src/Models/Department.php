<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class Department extends Model
{
    // 部门唯一代码
    /**
     * @example D001
     *
     * @var string
     */
    public $code;

    // 部门名称
    /**
     * @example 部门
     *
     * @var string
     */
    public $name;

    // 部门描述信息
    /**
     * @example
     *
     * @var string
     */
    public $description;

    // 父部门 code
    /**
     * @example D001
     *
     * @var string
     */
    public $parentCode;

    // 父部门一直到根节点的路径，例如：DP0000000001/DP0000000002
    /**
     * @example DP0000000001/DP0000000002
     *
     * @var string
     */
    public $parentPath;

    // 企业 id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $customerId;

    // 是否为叶子结点
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isLeaf;

    // 创建时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $creationTime;

    // 更新时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'code'         => 'code',
        'name'         => 'name',
        'description'  => 'description',
        'parentCode'   => 'parent_code',
        'parentPath'   => 'parent_path',
        'customerId'   => 'customer_id',
        'isLeaf'       => 'is_leaf',
        'creationTime' => 'creation_time',
        'updateTime'   => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->parentCode) {
            $res['parent_code'] = $this->parentCode;
        }
        if (null !== $this->parentPath) {
            $res['parent_path'] = $this->parentPath;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->isLeaf) {
            $res['is_leaf'] = $this->isLeaf;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Department
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['parent_code'])) {
            $model->parentCode = $map['parent_code'];
        }
        if (isset($map['parent_path'])) {
            $model->parentPath = $map['parent_path'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['is_leaf'])) {
            $model->isLeaf = $map['is_leaf'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
