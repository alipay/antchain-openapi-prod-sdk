<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UploadIpTradesalesRequest extends Model
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

    // 上传记录的用户的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // 订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // true 只上链不走真实支付，false 上链并链下真实支付账单
    /**
     * @var bool
     */
    public $onlyCallBlockchain;

    // 账单结算类型：即时计费0、按周计费1、按月计费2、按季度计费3。默认0
    /**
     * @var int
     */
    public $billingType;

    // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
    /**
     * @var string
     */
    public $payReturnUrl;

    // 授权佣金比例
    /**
     * @var string
     */
    public $authRate;

    // 定向授权按量付费单价
    /**
     * @var string
     */
    public $authPrice;

    // 商品销售数量
    /**
     * @var int
     */
    public $totalAmount;

    // 销售金额
    /**
     * @var string
     */
    public $totalSales;

    // 总的退款金额。不填默认为0
    /**
     * @var string
     */
    public $totalRefundSales;

    // 实付金额（授权交易）
    /**
     * @var string
     */
    public $totalPayment;

    // 销售数据列表
    /**
     * @var IPSalesInfo[]
     */
    public $ipSalesInfoList;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'baseRequest'        => 'base_request',
        'accountId'          => 'account_id',
        'ipOrderId'          => 'ip_order_id',
        'onlyCallBlockchain' => 'only_call_blockchain',
        'billingType'        => 'billing_type',
        'payReturnUrl'       => 'pay_return_url',
        'authRate'           => 'auth_rate',
        'authPrice'          => 'auth_price',
        'totalAmount'        => 'total_amount',
        'totalSales'         => 'total_sales',
        'totalRefundSales'   => 'total_refund_sales',
        'totalPayment'       => 'total_payment',
        'ipSalesInfoList'    => 'ip_sales_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('onlyCallBlockchain', $this->onlyCallBlockchain, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('totalSales', $this->totalSales, true);
        Model::validateRequired('totalPayment', $this->totalPayment, true);
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
        if (null !== $this->onlyCallBlockchain) {
            $res['only_call_blockchain'] = $this->onlyCallBlockchain;
        }
        if (null !== $this->billingType) {
            $res['billing_type'] = $this->billingType;
        }
        if (null !== $this->payReturnUrl) {
            $res['pay_return_url'] = $this->payReturnUrl;
        }
        if (null !== $this->authRate) {
            $res['auth_rate'] = $this->authRate;
        }
        if (null !== $this->authPrice) {
            $res['auth_price'] = $this->authPrice;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->totalSales) {
            $res['total_sales'] = $this->totalSales;
        }
        if (null !== $this->totalRefundSales) {
            $res['total_refund_sales'] = $this->totalRefundSales;
        }
        if (null !== $this->totalPayment) {
            $res['total_payment'] = $this->totalPayment;
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
     * @return UploadIpTradesalesRequest
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
        if (isset($map['only_call_blockchain'])) {
            $model->onlyCallBlockchain = $map['only_call_blockchain'];
        }
        if (isset($map['billing_type'])) {
            $model->billingType = $map['billing_type'];
        }
        if (isset($map['pay_return_url'])) {
            $model->payReturnUrl = $map['pay_return_url'];
        }
        if (isset($map['auth_rate'])) {
            $model->authRate = $map['auth_rate'];
        }
        if (isset($map['auth_price'])) {
            $model->authPrice = $map['auth_price'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['total_sales'])) {
            $model->totalSales = $map['total_sales'];
        }
        if (isset($map['total_refund_sales'])) {
            $model->totalRefundSales = $map['total_refund_sales'];
        }
        if (isset($map['total_payment'])) {
            $model->totalPayment = $map['total_payment'];
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
