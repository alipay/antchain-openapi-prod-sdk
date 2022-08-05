<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class UpdateProjectRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizid;

    // 数字权证项目ID
    /**
     * @var string
     */
    public $projectId;

    // 项目发行权证的总数上限。如果设置为可增发，则可以使用增发接口提高总数量上限
    /**
     * @var int
     */
    public $amount;

    // 项目发行后权证数量是否可增发。
    // true:可增发
    // false:不可增发
    /**
     * @var bool
     */
    public $limitedAmount;

    // 项目权证是否可核销。false:不可核销；true:可核销
    /**
     * @var bool
     */
    public $writeOffable;

    // 项目权证是否可销毁。false:不可销毁；true:可销毁
    /**
     * @var bool
     */
    public $burnable;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    /**
     * @var AccountInfo
     */
    public $accountInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'projectId'         => 'project_id',
        'amount'            => 'amount',
        'limitedAmount'     => 'limited_amount',
        'writeOffable'      => 'write_offable',
        'burnable'          => 'burnable',
        'accountInfo'       => 'account_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('accountInfo', $this->accountInfo, true);
        Model::validateMinimum('amount', $this->amount, 1);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->limitedAmount) {
            $res['limited_amount'] = $this->limitedAmount;
        }
        if (null !== $this->writeOffable) {
            $res['write_offable'] = $this->writeOffable;
        }
        if (null !== $this->burnable) {
            $res['burnable'] = $this->burnable;
        }
        if (null !== $this->accountInfo) {
            $res['account_info'] = null !== $this->accountInfo ? $this->accountInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateProjectRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['limited_amount'])) {
            $model->limitedAmount = $map['limited_amount'];
        }
        if (isset($map['write_offable'])) {
            $model->writeOffable = $map['write_offable'];
        }
        if (isset($map['burnable'])) {
            $model->burnable = $map['burnable'];
        }
        if (isset($map['account_info'])) {
            $model->accountInfo = AccountInfo::fromMap($map['account_info']);
        }

        return $model;
    }
}
