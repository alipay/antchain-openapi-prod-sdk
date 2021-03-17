<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class FinishRcpRtcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 申办业务号
    /**
     * @var string
     */
    public $applyBizId;

    // 业务状态，可选值：PENDING("审核中")、CANCELLED("已撤回")、DONE("已办结")、REJECTED("已退件")、NEED_MORE_MATERIAL("待补件")
    /**
     * @var string
     */
    public $bizStatus;

    // 业务类型，可选值：FIRST_BIZTYPE("不动产抵押权首次登记(普通抵押)"),、EGAGECANCEL_BIZTYPE("不动产抵押权注销登记")、FIRSTMAXGAGE_BIZTYPE("不动产抵押权首次登记(最高额抵押)")
    /**
     * @var string
     */
    public $bizType;

    // 被担保主债权数额
    /**
     * @var Amount
     */
    public $debtAmount;

    // 履债结束日期，格式为：yyyy-MM-dd
    /**
     * @var string
     */
    public $debtEndDate;

    // 履债开始日期，格式为：yyyy-MM-dd
    /**
     * @var string
     */
    public $debtStartDate;

    // 评估价值
    /**
     * @var Amount
     */
    public $evaluationAmount;

    // 抵押权人
    /**
     * @var EntityBasicInfo
     */
    public $mortgagee;

    // 抵押方式，可选值： NORMAL_MORT("一般抵押权")、MAX_AMOUNT_MORT("最高额抵押权")
    /**
     * @var string
     */
    public $mortgageType;

    // 他项权证信息
    /**
     * @var OtherRightInfo
     */
    public $otherRightInfo;

    // 登记日期，格式为：yyyy-MM-dd
    /**
     * @var string
     */
    public $registeredDate;

    // 材料文件列表，待缴费时必填）当业务状态为待缴费时，本材料文件列表会返回缴款通知书。
    /**
     * @var MaterialFileInfo[]
     */
    public $materialFileList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyBizId'        => 'apply_biz_id',
        'bizStatus'         => 'biz_status',
        'bizType'           => 'biz_type',
        'debtAmount'        => 'debt_amount',
        'debtEndDate'       => 'debt_end_date',
        'debtStartDate'     => 'debt_start_date',
        'evaluationAmount'  => 'evaluation_amount',
        'mortgagee'         => 'mortgagee',
        'mortgageType'      => 'mortgage_type',
        'otherRightInfo'    => 'other_right_info',
        'registeredDate'    => 'registered_date',
        'materialFileList'  => 'material_file_list',
    ];

    public function validate()
    {
        Model::validateRequired('applyBizId', $this->applyBizId, true);
        Model::validateRequired('bizStatus', $this->bizStatus, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('debtAmount', $this->debtAmount, true);
        Model::validateRequired('mortgagee', $this->mortgagee, true);
        Model::validateRequired('mortgageType', $this->mortgageType, true);
        Model::validateRequired('otherRightInfo', $this->otherRightInfo, true);
        Model::validateRequired('registeredDate', $this->registeredDate, true);
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
        if (null !== $this->applyBizId) {
            $res['apply_biz_id'] = $this->applyBizId;
        }
        if (null !== $this->bizStatus) {
            $res['biz_status'] = $this->bizStatus;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->debtAmount) {
            $res['debt_amount'] = null !== $this->debtAmount ? $this->debtAmount->toMap() : null;
        }
        if (null !== $this->debtEndDate) {
            $res['debt_end_date'] = $this->debtEndDate;
        }
        if (null !== $this->debtStartDate) {
            $res['debt_start_date'] = $this->debtStartDate;
        }
        if (null !== $this->evaluationAmount) {
            $res['evaluation_amount'] = null !== $this->evaluationAmount ? $this->evaluationAmount->toMap() : null;
        }
        if (null !== $this->mortgagee) {
            $res['mortgagee'] = null !== $this->mortgagee ? $this->mortgagee->toMap() : null;
        }
        if (null !== $this->mortgageType) {
            $res['mortgage_type'] = $this->mortgageType;
        }
        if (null !== $this->otherRightInfo) {
            $res['other_right_info'] = null !== $this->otherRightInfo ? $this->otherRightInfo->toMap() : null;
        }
        if (null !== $this->registeredDate) {
            $res['registered_date'] = $this->registeredDate;
        }
        if (null !== $this->materialFileList) {
            $res['material_file_list'] = [];
            if (null !== $this->materialFileList && \is_array($this->materialFileList)) {
                $n = 0;
                foreach ($this->materialFileList as $item) {
                    $res['material_file_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishRcpRtcRequest
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
        if (isset($map['apply_biz_id'])) {
            $model->applyBizId = $map['apply_biz_id'];
        }
        if (isset($map['biz_status'])) {
            $model->bizStatus = $map['biz_status'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['debt_amount'])) {
            $model->debtAmount = Amount::fromMap($map['debt_amount']);
        }
        if (isset($map['debt_end_date'])) {
            $model->debtEndDate = $map['debt_end_date'];
        }
        if (isset($map['debt_start_date'])) {
            $model->debtStartDate = $map['debt_start_date'];
        }
        if (isset($map['evaluation_amount'])) {
            $model->evaluationAmount = Amount::fromMap($map['evaluation_amount']);
        }
        if (isset($map['mortgagee'])) {
            $model->mortgagee = EntityBasicInfo::fromMap($map['mortgagee']);
        }
        if (isset($map['mortgage_type'])) {
            $model->mortgageType = $map['mortgage_type'];
        }
        if (isset($map['other_right_info'])) {
            $model->otherRightInfo = OtherRightInfo::fromMap($map['other_right_info']);
        }
        if (isset($map['registered_date'])) {
            $model->registeredDate = $map['registered_date'];
        }
        if (isset($map['material_file_list'])) {
            if (!empty($map['material_file_list'])) {
                $model->materialFileList = [];
                $n                       = 0;
                foreach ($map['material_file_list'] as $item) {
                    $model->materialFileList[$n++] = null !== $item ? MaterialFileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
