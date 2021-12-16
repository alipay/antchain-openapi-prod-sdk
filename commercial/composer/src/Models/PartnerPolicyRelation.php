<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PartnerPolicyRelation extends Model
{
    // 合同id
    /**
     * @example 2021032410730500140A00330000088993
     *
     * @var string
     */
    public $agreementId;

    // 服务商id
    /**
     * @example 2088124521254
     *
     * @var string
     */
    public $spId;

    // 合同生效时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 合同失效时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 合同取消时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $cancelTime;

    // 政策id
    /**
     * @example 202103240P00072593
     *
     * @var string
     */
    public $policyId;

    // 政策名称
    /**
     * @example 酒店saas
     *
     * @var string
     */
    public $policyName;

    // 政策类型
    /**
     * @example REBATE
     *
     * @var string
     */
    public $policyType;

    // 政策link
    /**
     * @example www.alipay.com
     *
     * @var string
     */
    public $policyLink;

    // 政策所属ou
    /**
     * @example 小微金融有限公司
     *
     * @var string
     */
    public $policyOu;

    // 结算类型
    /**
     * @example MONTH
     *
     * @var string
     */
    public $settleType;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;
    protected $_name = [
        'agreementId' => 'agreement_id',
        'spId'        => 'sp_id',
        'startTime'   => 'start_time',
        'endTime'     => 'end_time',
        'cancelTime'  => 'cancel_time',
        'policyId'    => 'policy_id',
        'policyName'  => 'policy_name',
        'policyType'  => 'policy_type',
        'policyLink'  => 'policy_link',
        'policyOu'    => 'policy_ou',
        'settleType'  => 'settle_type',
        'gmtModified' => 'gmt_modified',
        'gmtCreate'   => 'gmt_create',
    ];

    public function validate()
    {
        Model::validateRequired('agreementId', $this->agreementId, true);
        Model::validateRequired('spId', $this->spId, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('policyId', $this->policyId, true);
        Model::validateRequired('policyName', $this->policyName, true);
        Model::validateRequired('policyType', $this->policyType, true);
        Model::validateRequired('settleType', $this->settleType, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('cancelTime', $this->cancelTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agreementId) {
            $res['agreement_id'] = $this->agreementId;
        }
        if (null !== $this->spId) {
            $res['sp_id'] = $this->spId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->cancelTime) {
            $res['cancel_time'] = $this->cancelTime;
        }
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }
        if (null !== $this->policyName) {
            $res['policy_name'] = $this->policyName;
        }
        if (null !== $this->policyType) {
            $res['policy_type'] = $this->policyType;
        }
        if (null !== $this->policyLink) {
            $res['policy_link'] = $this->policyLink;
        }
        if (null !== $this->policyOu) {
            $res['policy_ou'] = $this->policyOu;
        }
        if (null !== $this->settleType) {
            $res['settle_type'] = $this->settleType;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartnerPolicyRelation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agreement_id'])) {
            $model->agreementId = $map['agreement_id'];
        }
        if (isset($map['sp_id'])) {
            $model->spId = $map['sp_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['cancel_time'])) {
            $model->cancelTime = $map['cancel_time'];
        }
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }
        if (isset($map['policy_name'])) {
            $model->policyName = $map['policy_name'];
        }
        if (isset($map['policy_type'])) {
            $model->policyType = $map['policy_type'];
        }
        if (isset($map['policy_link'])) {
            $model->policyLink = $map['policy_link'];
        }
        if (isset($map['policy_ou'])) {
            $model->policyOu = $map['policy_ou'];
        }
        if (isset($map['settle_type'])) {
            $model->settleType = $map['settle_type'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }

        return $model;
    }
}
