<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AccountMap extends Model
{
    // 要映射的链对应的唯一id
    /**
     * @example 12345
     *
     * @var string
     */
    public $bizid;

    // 0: 身份证；1：手机；2: 电子邮箱；3: 企业营业执照号
    /**
     * @example 0
     *
     * @var int
     */
    public $entityInfoType;

    // 对应entity_info_type的具体值
    //
    /**
     * @example 18701207322
     *
     * @var string
     */
    public $entityInfoValue;

    // 账户对应实体的全名
    /**
     * @example huihui.liu
     *
     * @var string
     */
    public $fullName;

    // 该账户在指定链上的状态1，激活，2，冻结，新建账户只能为1
    /**
     * @example
     *
     * @var int
     */
    public $status;

    // 希望映射后在链上的账户名
    /**
     * @example huihui_online
     *
     * @var string
     */
    public $targetName;

    // 该账户对应实体的类型：0， 个人； 1， 企业
    /**
     * @example 1
     *
     * @var int
     */
    public $type;

    // 自有系统中该账户的唯一标示
    /**
     * @example huihui
     *
     * @var string
     */
    public $uid;
    protected $_name = [
        'bizid'           => 'bizid',
        'entityInfoType'  => 'entity_info_type',
        'entityInfoValue' => 'entity_info_value',
        'fullName'        => 'full_name',
        'status'          => 'status',
        'targetName'      => 'target_name',
        'type'            => 'type',
        'uid'             => 'uid',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('uid', $this->uid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->entityInfoType) {
            $res['entity_info_type'] = $this->entityInfoType;
        }
        if (null !== $this->entityInfoValue) {
            $res['entity_info_value'] = $this->entityInfoValue;
        }
        if (null !== $this->fullName) {
            $res['full_name'] = $this->fullName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountMap
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['entity_info_type'])) {
            $model->entityInfoType = $map['entity_info_type'];
        }
        if (isset($map['entity_info_value'])) {
            $model->entityInfoValue = $map['entity_info_value'];
        }
        if (isset($map['full_name'])) {
            $model->fullName = $map['full_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }

        return $model;
    }
}
