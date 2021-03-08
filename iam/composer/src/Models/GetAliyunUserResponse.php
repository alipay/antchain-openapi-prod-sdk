<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetAliyunUserResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 阿里云用户ID
    /**
     * @var string
     */
    public $id;

    // 主账号类型下有值，即type为ENTERPRISE和PERSONAL时有值
    /**
     * @var string
     */
    public $loginName;

    // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
    /**
     * @var string
     */
    public $name;

    // RAM子账号的显示名称
    /**
     * @var string
     */
    public $ramDisplayName;

    // 用户所属租户
    /**
     * @var string
     */
    public $tenant;

    // 阿里云用户类型，分为主账号企业（ENTERPRISE），主账号个人（PERSONAL），和子账号（RAM）
    /**
     * @var string
     */
    public $type;

    // 显示名
    /**
     * @var string
     */
    public $displayName;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'id'             => 'id',
        'loginName'      => 'login_name',
        'name'           => 'name',
        'ramDisplayName' => 'ram_display_name',
        'tenant'         => 'tenant',
        'type'           => 'type',
        'displayName'    => 'display_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ramDisplayName) {
            $res['ram_display_name'] = $this->ramDisplayName;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAliyunUserResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['ram_display_name'])) {
            $model->ramDisplayName = $map['ram_display_name'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }

        return $model;
    }
}
