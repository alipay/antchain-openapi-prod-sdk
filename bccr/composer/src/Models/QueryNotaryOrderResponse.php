<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryNotaryOrderResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 订单状态
    /**
     * @var string
     */
    public $status;

    // 支付状态最后更新时间戳
    /**
     * @var int
     */
    public $payTime;

    // 用户预览签署文件的时间戳
    /**
     * @var int
     */
    public $previewTime;

    // 支付状态
    /**
     * @var string
     */
    public $payStatus;

    // 补充材料说明，当需要补充材料时提供
    /**
     * @var string
     */
    public $materialRemarks;

    // 出证的公证书信息
    /**
     * @var NotaryInfo
     */
    public $notaryInfo;

    // 拒绝办理信息
    /**
     * @var RefuseInfo
     */
    public $rejectInfo;

    // 终止信息
    /**
     * @var RefuseInfo
     */
    public $terminalInfo;

    // 支付方式
    /**
     * @var string
     */
    public $payType;

    // 用户应付的金额
    /**
     * @var int
     */
    public $payableAmount;

    // 用户实际支付的金额
    /**
     * @var int
     */
    public $paidAmount;

    // 公证处物流信息
    /**
     * @var ExpressInfo[]
     */
    public $notaryExpressList;

    // 发票物流信息
    /**
     * @var ExpressInfo[]
     */
    public $invoiceExpressList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'status'             => 'status',
        'payTime'            => 'pay_time',
        'previewTime'        => 'preview_time',
        'payStatus'          => 'pay_status',
        'materialRemarks'    => 'material_remarks',
        'notaryInfo'         => 'notary_info',
        'rejectInfo'         => 'reject_info',
        'terminalInfo'       => 'terminal_info',
        'payType'            => 'pay_type',
        'payableAmount'      => 'payable_amount',
        'paidAmount'         => 'paid_amount',
        'notaryExpressList'  => 'notary_express_list',
        'invoiceExpressList' => 'invoice_express_list',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->previewTime) {
            $res['preview_time'] = $this->previewTime;
        }
        if (null !== $this->payStatus) {
            $res['pay_status'] = $this->payStatus;
        }
        if (null !== $this->materialRemarks) {
            $res['material_remarks'] = $this->materialRemarks;
        }
        if (null !== $this->notaryInfo) {
            $res['notary_info'] = null !== $this->notaryInfo ? $this->notaryInfo->toMap() : null;
        }
        if (null !== $this->rejectInfo) {
            $res['reject_info'] = null !== $this->rejectInfo ? $this->rejectInfo->toMap() : null;
        }
        if (null !== $this->terminalInfo) {
            $res['terminal_info'] = null !== $this->terminalInfo ? $this->terminalInfo->toMap() : null;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->payableAmount) {
            $res['payable_amount'] = $this->payableAmount;
        }
        if (null !== $this->paidAmount) {
            $res['paid_amount'] = $this->paidAmount;
        }
        if (null !== $this->notaryExpressList) {
            $res['notary_express_list'] = [];
            if (null !== $this->notaryExpressList && \is_array($this->notaryExpressList)) {
                $n = 0;
                foreach ($this->notaryExpressList as $item) {
                    $res['notary_express_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->invoiceExpressList) {
            $res['invoice_express_list'] = [];
            if (null !== $this->invoiceExpressList && \is_array($this->invoiceExpressList)) {
                $n = 0;
                foreach ($this->invoiceExpressList as $item) {
                    $res['invoice_express_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNotaryOrderResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['pay_time'])) {
            $model->payTime = $map['pay_time'];
        }
        if (isset($map['preview_time'])) {
            $model->previewTime = $map['preview_time'];
        }
        if (isset($map['pay_status'])) {
            $model->payStatus = $map['pay_status'];
        }
        if (isset($map['material_remarks'])) {
            $model->materialRemarks = $map['material_remarks'];
        }
        if (isset($map['notary_info'])) {
            $model->notaryInfo = NotaryInfo::fromMap($map['notary_info']);
        }
        if (isset($map['reject_info'])) {
            $model->rejectInfo = RefuseInfo::fromMap($map['reject_info']);
        }
        if (isset($map['terminal_info'])) {
            $model->terminalInfo = RefuseInfo::fromMap($map['terminal_info']);
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['payable_amount'])) {
            $model->payableAmount = $map['payable_amount'];
        }
        if (isset($map['paid_amount'])) {
            $model->paidAmount = $map['paid_amount'];
        }
        if (isset($map['notary_express_list'])) {
            if (!empty($map['notary_express_list'])) {
                $model->notaryExpressList = [];
                $n                        = 0;
                foreach ($map['notary_express_list'] as $item) {
                    $model->notaryExpressList[$n++] = null !== $item ? ExpressInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['invoice_express_list'])) {
            if (!empty($map['invoice_express_list'])) {
                $model->invoiceExpressList = [];
                $n                         = 0;
                foreach ($map['invoice_express_list'] as $item) {
                    $model->invoiceExpressList[$n++] = null !== $item ? ExpressInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
