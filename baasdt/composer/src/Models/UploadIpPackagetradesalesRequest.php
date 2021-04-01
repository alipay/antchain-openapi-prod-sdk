<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UploadIpPackagetradesalesRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 买方的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // 关联订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // 销售数据列表
    /**
     * @var IPSalesInfo[]
     */
    public $ipSalesInfoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'ipOrderId'         => 'ip_order_id',
        'ipSalesInfoList'   => 'ip_sales_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('ipSalesInfoList', $this->ipSalesInfoList, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->ipSalesInfoList) {
            $res['ip_sales_info_list'] = [];
            if (null !== $this->ipSalesInfoList && \is_array($this->ipSalesInfoList)) {
                $n = 0;
                foreach ($this->ipSalesInfoList as $item) {
                    $res['ip_sales_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadIpPackagetradesalesRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['ip_sales_info_list'])) {
            if (!empty($map['ip_sales_info_list'])) {
                $model->ipSalesInfoList = [];
                $n                      = 0;
                foreach ($map['ip_sales_info_list'] as $item) {
                    $model->ipSalesInfoList[$n++] = null !== $item ? IPSalesInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
