<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryPbcNameRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 省份名称
    /**
     * @var string
     */
    public $province;

    // 城市名称
    /**
     * @var string
     */
    public $city;

    // 银行机构id
    /**
     * @var string
     */
    public $instId;

    // 支行名称关键字
    /**
     * @var string
     */
    public $branchName;
    protected $_name = [
        'authToken'  => 'auth_token',
        'province'   => 'province',
        'city'       => 'city',
        'instId'     => 'inst_id',
        'branchName' => 'branch_name',
    ];

    public function validate()
    {
        Model::validateRequired('province', $this->province, true);
        Model::validateRequired('city', $this->city, true);
        Model::validateRequired('instId', $this->instId, true);
        Model::validateRequired('branchName', $this->branchName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->instId) {
            $res['inst_id'] = $this->instId;
        }
        if (null !== $this->branchName) {
            $res['branch_name'] = $this->branchName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPbcNameRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['inst_id'])) {
            $model->instId = $map['inst_id'];
        }
        if (isset($map['branch_name'])) {
            $model->branchName = $map['branch_name'];
        }

        return $model;
    }
}
