<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceEndorsementRequest extends Model
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

    // 批单申请号
    /**
     * @var string
     */
    public $endorsementApplyNo;

    // 申请时间
    /**
     * @var string
     */
    public $endorsementApplyDate;

    // 保单号
    /**
     * @var string
     */
    public $insuranceNumber;

    // 保司编码
    /**
     * @var string
     */
    public $insuranceCode;

    // 批单保额，单位：元，最多两位小数
    /**
     * @var string
     */
    public $endorsementApplyAmount;

    // [{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000003(标的类型:包裹)","objNo":"标的编号","logisticsNo":"物流单号","sellerID":"卖家ID","objName":"货物名称","objType":"货物类型","objAmount":"货物金额(元)","buyerID":"买家ID"}},{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000002(标的类型:入库单)","objNo":"标的编号","pkgInNo":"入库编号","merchantName":"商家","objName":"货物","objType":"货物类型","objCount":"货物数量","objAmount":"货物金额(元)","buyerID":""}}]
    /**
     * @var string[]
     */
    public $endorsementApplyContents;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'endorsementApplyNo'       => 'endorsement_apply_no',
        'endorsementApplyDate'     => 'endorsement_apply_date',
        'insuranceNumber'          => 'insurance_number',
        'insuranceCode'            => 'insurance_code',
        'endorsementApplyAmount'   => 'endorsement_apply_amount',
        'endorsementApplyContents' => 'endorsement_apply_contents',
    ];

    public function validate()
    {
        Model::validateRequired('endorsementApplyNo', $this->endorsementApplyNo, true);
        Model::validateRequired('endorsementApplyDate', $this->endorsementApplyDate, true);
        Model::validateRequired('insuranceNumber', $this->insuranceNumber, true);
        Model::validateRequired('insuranceCode', $this->insuranceCode, true);
        Model::validateRequired('endorsementApplyAmount', $this->endorsementApplyAmount, true);
        Model::validateRequired('endorsementApplyContents', $this->endorsementApplyContents, true);
        Model::validatePattern('endorsementApplyDate', $this->endorsementApplyDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->endorsementApplyNo) {
            $res['endorsement_apply_no'] = $this->endorsementApplyNo;
        }
        if (null !== $this->endorsementApplyDate) {
            $res['endorsement_apply_date'] = $this->endorsementApplyDate;
        }
        if (null !== $this->insuranceNumber) {
            $res['insurance_number'] = $this->insuranceNumber;
        }
        if (null !== $this->insuranceCode) {
            $res['insurance_code'] = $this->insuranceCode;
        }
        if (null !== $this->endorsementApplyAmount) {
            $res['endorsement_apply_amount'] = $this->endorsementApplyAmount;
        }
        if (null !== $this->endorsementApplyContents) {
            $res['endorsement_apply_contents'] = $this->endorsementApplyContents;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceEndorsementRequest
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
        if (isset($map['endorsement_apply_no'])) {
            $model->endorsementApplyNo = $map['endorsement_apply_no'];
        }
        if (isset($map['endorsement_apply_date'])) {
            $model->endorsementApplyDate = $map['endorsement_apply_date'];
        }
        if (isset($map['insurance_number'])) {
            $model->insuranceNumber = $map['insurance_number'];
        }
        if (isset($map['insurance_code'])) {
            $model->insuranceCode = $map['insurance_code'];
        }
        if (isset($map['endorsement_apply_amount'])) {
            $model->endorsementApplyAmount = $map['endorsement_apply_amount'];
        }
        if (isset($map['endorsement_apply_contents'])) {
            if (!empty($map['endorsement_apply_contents'])) {
                $model->endorsementApplyContents = $map['endorsement_apply_contents'];
            }
        }

        return $model;
    }
}
