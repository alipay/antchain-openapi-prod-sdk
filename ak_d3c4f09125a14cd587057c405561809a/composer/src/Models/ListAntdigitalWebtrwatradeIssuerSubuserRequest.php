<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class ListAntdigitalWebtrwatradeIssuerSubuserRequest extends Model
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

    // 资产项目ID（资产项目ID、资产项目合约地址+所在链 二选一必填）
    /**
     * @var string
     */
    public $assetProjectId;

    // 资产项目合约地址（资产项目ID、资产项目合约地址+所在链 二选一必填）
    /**
     * @var string
     */
    public $assetProjectAddress;

    // 项目所在链（资产项目ID、资产项目合约地址+所在链 二选一必填）
    /**
     * @var string
     */
    public $chainName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'assetProjectId'      => 'asset_project_id',
        'assetProjectAddress' => 'asset_project_address',
        'chainName'           => 'chain_name',
    ];

    public function validate()
    {
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
        if (null !== $this->assetProjectId) {
            $res['asset_project_id'] = $this->assetProjectId;
        }
        if (null !== $this->assetProjectAddress) {
            $res['asset_project_address'] = $this->assetProjectAddress;
        }
        if (null !== $this->chainName) {
            $res['chain_name'] = $this->chainName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAntdigitalWebtrwatradeIssuerSubuserRequest
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
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
        }
        if (isset($map['asset_project_address'])) {
            $model->assetProjectAddress = $map['asset_project_address'];
        }
        if (isset($map['chain_name'])) {
            $model->chainName = $map['chain_name'];
        }

        return $model;
    }
}
