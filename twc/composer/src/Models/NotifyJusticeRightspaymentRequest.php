<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class NotifyJusticeRightspaymentRequest extends Model
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

    // 案件维权记录编号
    /**
     * @var int
     */
    public $recordId;

    // 缴费金额(支持两位小数)
    /**
     * @var string
     */
    public $amount;

    // 费用类型(枚举)
    // ARBITRATION: 仲裁案件受理费
    /**
     * @var string
     */
    public $paymentType;

    // 缴费状态(枚举)
    // WAIT_FEE: 待缴费
    // SUCCESS: 成功
    // FAIL: 失败
    /**
     * @var string
     */
    public $paymentStatus;

    // 缴费失败的描述(不是缴费完成时,必填)
    // 不超过500字符
    /**
     * @var string
     */
    public $paymentRemark;

    // 相关的文件信息列表,示例查看对接文档
    /**
     * @var FileInfo[]
     */
    public $paymentFileInfos;

    // 缴费账户信息(待缴费时必填),示例查看对接文档
    /**
     * @var PaymentInfo
     */
    public $paymentInfo;

    // 缴费状态(SUCCESS)实际对应时间
    /**
     * @var string
     */
    public $paymentStatusSuccessDate;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'recordId'                 => 'record_id',
        'amount'                   => 'amount',
        'paymentType'              => 'payment_type',
        'paymentStatus'            => 'payment_status',
        'paymentRemark'            => 'payment_remark',
        'paymentFileInfos'         => 'payment_file_infos',
        'paymentInfo'              => 'payment_info',
        'paymentStatusSuccessDate' => 'payment_status_success_date',
    ];

    public function validate()
    {
        Model::validateRequired('recordId', $this->recordId, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('paymentType', $this->paymentType, true);
        Model::validateRequired('paymentStatus', $this->paymentStatus, true);
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
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->paymentType) {
            $res['payment_type'] = $this->paymentType;
        }
        if (null !== $this->paymentStatus) {
            $res['payment_status'] = $this->paymentStatus;
        }
        if (null !== $this->paymentRemark) {
            $res['payment_remark'] = $this->paymentRemark;
        }
        if (null !== $this->paymentFileInfos) {
            $res['payment_file_infos'] = [];
            if (null !== $this->paymentFileInfos && \is_array($this->paymentFileInfos)) {
                $n = 0;
                foreach ($this->paymentFileInfos as $item) {
                    $res['payment_file_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->paymentInfo) {
            $res['payment_info'] = null !== $this->paymentInfo ? $this->paymentInfo->toMap() : null;
        }
        if (null !== $this->paymentStatusSuccessDate) {
            $res['payment_status_success_date'] = $this->paymentStatusSuccessDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyJusticeRightspaymentRequest
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
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['payment_type'])) {
            $model->paymentType = $map['payment_type'];
        }
        if (isset($map['payment_status'])) {
            $model->paymentStatus = $map['payment_status'];
        }
        if (isset($map['payment_remark'])) {
            $model->paymentRemark = $map['payment_remark'];
        }
        if (isset($map['payment_file_infos'])) {
            if (!empty($map['payment_file_infos'])) {
                $model->paymentFileInfos = [];
                $n                       = 0;
                foreach ($map['payment_file_infos'] as $item) {
                    $model->paymentFileInfos[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['payment_info'])) {
            $model->paymentInfo = PaymentInfo::fromMap($map['payment_info']);
        }
        if (isset($map['payment_status_success_date'])) {
            $model->paymentStatusSuccessDate = $map['payment_status_success_date'];
        }

        return $model;
    }
}
