<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PagequeryPartnercorePolicyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 政策名称（字段保留） 不做调用
    /**
     * @var string
     */
    public $policyName;

    // 政策状态（字段保留） 不做调用
    /**
     * @var string
     */
    public $policyStatus;

    // 签约状态 SIGNED已签约 UNSIGNED 待签约
    /**
     * @var string
     */
    public $signStatus;

    // 当前页码
    /**
     * @var int
     */
    public $current;

    // 每页记录数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'    => 'auth_token',
        'policyName'   => 'policy_name',
        'policyStatus' => 'policy_status',
        'signStatus'   => 'sign_status',
        'current'      => 'current',
        'pageSize'     => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->policyName) {
            $res['policy_name'] = $this->policyName;
        }
        if (null !== $this->policyStatus) {
            $res['policy_status'] = $this->policyStatus;
        }
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryPartnercorePolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['policy_name'])) {
            $model->policyName = $map['policy_name'];
        }
        if (isset($map['policy_status'])) {
            $model->policyStatus = $map['policy_status'];
        }
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
