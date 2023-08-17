<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class AddItagAntitagUserTntRequest extends Model
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

    // 标注平台的租户ID
    /**
     * @var string
     */
    public $tntinstid;

    // 第三方账号
    /**
     * @var string
     */
    public $accountno;

    // 用户来源
    /**
     * @var string
     */
    public $accountsource;

    // 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
    /**
     * @var string
     */
    public $role;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tntinstid'         => 'tntinstid',
        'accountno'         => 'accountno',
        'accountsource'     => 'accountsource',
        'role'              => 'role',
    ];

    public function validate()
    {
        Model::validateRequired('tntinstid', $this->tntinstid, true);
        Model::validateRequired('accountno', $this->accountno, true);
        Model::validateRequired('accountsource', $this->accountsource, true);
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
        if (null !== $this->tntinstid) {
            $res['tntinstid'] = $this->tntinstid;
        }
        if (null !== $this->accountno) {
            $res['accountno'] = $this->accountno;
        }
        if (null !== $this->accountsource) {
            $res['accountsource'] = $this->accountsource;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddItagAntitagUserTntRequest
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
        if (isset($map['tntinstid'])) {
            $model->tntinstid = $map['tntinstid'];
        }
        if (isset($map['accountno'])) {
            $model->accountno = $map['accountno'];
        }
        if (isset($map['accountsource'])) {
            $model->accountsource = $map['accountsource'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }

        return $model;
    }
}
