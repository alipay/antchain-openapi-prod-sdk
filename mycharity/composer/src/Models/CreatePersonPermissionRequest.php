<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class CreatePersonPermissionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 机构ID(第三方指定ID 50字符)
    /**
     * @var string
     */
    public $orgId;

    // 项目角色ID(1项目管理员、2项目执行人、3项目财务)
    /**
     * @var int
     */
    public $roleId;

    // 项目ID(第三方指定ID 50字符)
    /**
     * @var string
     */
    public $pjId;

    // 被授权人支付宝用户标识(16字符)
    /**
     * @var string
     */
    public $alipayUserId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orgId'             => 'org_id',
        'roleId'            => 'role_id',
        'pjId'              => 'pj_id',
        'alipayUserId'      => 'alipay_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('roleId', $this->roleId, true);
        Model::validateRequired('pjId', $this->pjId, true);
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->roleId) {
            $res['role_id'] = $this->roleId;
        }
        if (null !== $this->pjId) {
            $res['pj_id'] = $this->pjId;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreatePersonPermissionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['role_id'])) {
            $model->roleId = $map['role_id'];
        }
        if (isset($map['pj_id'])) {
            $model->pjId = $map['pj_id'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }

        return $model;
    }
}
