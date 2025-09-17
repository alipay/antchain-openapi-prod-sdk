<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBenefithubReportInformationResponse extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $uuid;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 平台code
    /**
     * @var string
     */
    public $platformCode;

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // 报案号
    /**
     * @var string
     */
    public $reportNo;

    // 报告生成时间
    /**
     * @var string
     */
    public $reportTime;

    // 报案到期时间
    /**
     * @var string
     */
    public $reportEndTime;

    // 报告内容
    /**
     * @var string
     */
    public $reportContent;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 用户姓名
    /**
     * @var string
     */
    public $name;

    // 身份证号
    /**
     * @var string
     */
    public $idCard;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'uuid'          => 'uuid',
        'orderNo'       => 'order_no',
        'platformCode'  => 'platform_code',
        'productCode'   => 'product_code',
        'reportNo'      => 'report_no',
        'reportTime'    => 'report_time',
        'reportEndTime' => 'report_end_time',
        'reportContent' => 'report_content',
        'status'        => 'status',
        'name'          => 'name',
        'idCard'        => 'id_card',
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
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->platformCode) {
            $res['platform_code'] = $this->platformCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->reportEndTime) {
            $res['report_end_time'] = $this->reportEndTime;
        }
        if (null !== $this->reportContent) {
            $res['report_content'] = $this->reportContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBenefithubReportInformationResponse
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
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['platform_code'])) {
            $model->platformCode = $map['platform_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }
        if (isset($map['report_end_time'])) {
            $model->reportEndTime = $map['report_end_time'];
        }
        if (isset($map['report_content'])) {
            $model->reportContent = $map['report_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }

        return $model;
    }
}
