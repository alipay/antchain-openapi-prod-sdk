<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateNotarizationBillRequest extends Model
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

    // 支付宝交易订单号
    /**
     * @var string
     */
    public $alipayOrderNo;

    // 支付宝用户ID
    /**
     * @var string
     */
    public $alipayUid;

    // 申请者名称
    /**
     * @var string
     */
    public $certName;

    // 申请者证件号码：身份证号码（个人用户）或企业统一社会信用代码（企业用户）
    /**
     * @var string
     */
    public $certNo;

    // 电子公证书业务细项，如“200”对应出生公证
    /**
     * @var string
     */
    public $eNotarizationBiz;

    // 电子公证书下载地址
    /**
     * @var string
     */
    public $eNotarizationDownloadUrl;

    // 电子公证书编号
    /**
     * @var string
     */
    public $eNotarizationNo;

    // 电子公证书页数
    /**
     * @var string
     */
    public $eNotarizationPageNo;

    // 电子公证书状态码
    /**
     * @var string
     */
    public $eNotarizationStatus;

    // 电子公证书业务用途
    /**
     * @var string
     */
    public $eNotarizationUsage;

    // 电子公证书有效期
    /**
     * @var string
     */
    public $eNotarizationValidDate;

    // 企业法人姓名（企业用户必填）
    /**
     * @var string
     */
    public $legalPersonName;

    // 出证订单ID
    /**
     * @var string
     */
    public $orderId;

    // 出证机构ID
    /**
     * @var string
     */
    public $orgId;

    // 支付宝交易订单支付金额（人民币），单位为分
    /**
     * @var int
     */
    public $paymentAmount;

    // 联系电话
    /**
     * @var string
     */
    public $phone;

    // 场景枚举：E_NOTARIZATION（电子公证），NOTARY_CERTIFICATION（存证证明）
    /**
     * @var string
     */
    public $scenario;

    // 申请者身份类型，1个人，2企业
    /**
     * @var int
     */
    public $userType;

    // 是否为酬金分润方式，是则按照订金额一定比例分润，否则直接支付订单金额
    /**
     * @var bool
     */
    public $feeSplitting;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'alipayOrderNo'            => 'alipay_order_no',
        'alipayUid'                => 'alipay_uid',
        'certName'                 => 'cert_name',
        'certNo'                   => 'cert_no',
        'eNotarizationBiz'         => 'e_notarization_biz',
        'eNotarizationDownloadUrl' => 'e_notarization_download_url',
        'eNotarizationNo'          => 'e_notarization_no',
        'eNotarizationPageNo'      => 'e_notarization_page_no',
        'eNotarizationStatus'      => 'e_notarization_status',
        'eNotarizationUsage'       => 'e_notarization_usage',
        'eNotarizationValidDate'   => 'e_notarization_valid_date',
        'legalPersonName'          => 'legal_person_name',
        'orderId'                  => 'order_id',
        'orgId'                    => 'org_id',
        'paymentAmount'            => 'payment_amount',
        'phone'                    => 'phone',
        'scenario'                 => 'scenario',
        'userType'                 => 'user_type',
        'feeSplitting'             => 'fee_splitting',
    ];

    public function validate()
    {
        Model::validatePattern('eNotarizationValidDate', $this->eNotarizationValidDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('scenario', $this->scenario, true);
        Model::validateRequired('feeSplitting', $this->feeSplitting, true);
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
        if (null !== $this->alipayOrderNo) {
            $res['alipay_order_no'] = $this->alipayOrderNo;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->eNotarizationBiz) {
            $res['e_notarization_biz'] = $this->eNotarizationBiz;
        }
        if (null !== $this->eNotarizationDownloadUrl) {
            $res['e_notarization_download_url'] = $this->eNotarizationDownloadUrl;
        }
        if (null !== $this->eNotarizationNo) {
            $res['e_notarization_no'] = $this->eNotarizationNo;
        }
        if (null !== $this->eNotarizationPageNo) {
            $res['e_notarization_page_no'] = $this->eNotarizationPageNo;
        }
        if (null !== $this->eNotarizationStatus) {
            $res['e_notarization_status'] = $this->eNotarizationStatus;
        }
        if (null !== $this->eNotarizationUsage) {
            $res['e_notarization_usage'] = $this->eNotarizationUsage;
        }
        if (null !== $this->eNotarizationValidDate) {
            $res['e_notarization_valid_date'] = $this->eNotarizationValidDate;
        }
        if (null !== $this->legalPersonName) {
            $res['legal_person_name'] = $this->legalPersonName;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->paymentAmount) {
            $res['payment_amount'] = $this->paymentAmount;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->scenario) {
            $res['scenario'] = $this->scenario;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->feeSplitting) {
            $res['fee_splitting'] = $this->feeSplitting;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateNotarizationBillRequest
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
        if (isset($map['alipay_order_no'])) {
            $model->alipayOrderNo = $map['alipay_order_no'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['e_notarization_biz'])) {
            $model->eNotarizationBiz = $map['e_notarization_biz'];
        }
        if (isset($map['e_notarization_download_url'])) {
            $model->eNotarizationDownloadUrl = $map['e_notarization_download_url'];
        }
        if (isset($map['e_notarization_no'])) {
            $model->eNotarizationNo = $map['e_notarization_no'];
        }
        if (isset($map['e_notarization_page_no'])) {
            $model->eNotarizationPageNo = $map['e_notarization_page_no'];
        }
        if (isset($map['e_notarization_status'])) {
            $model->eNotarizationStatus = $map['e_notarization_status'];
        }
        if (isset($map['e_notarization_usage'])) {
            $model->eNotarizationUsage = $map['e_notarization_usage'];
        }
        if (isset($map['e_notarization_valid_date'])) {
            $model->eNotarizationValidDate = $map['e_notarization_valid_date'];
        }
        if (isset($map['legal_person_name'])) {
            $model->legalPersonName = $map['legal_person_name'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['payment_amount'])) {
            $model->paymentAmount = $map['payment_amount'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['scenario'])) {
            $model->scenario = $map['scenario'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['fee_splitting'])) {
            $model->feeSplitting = $map['fee_splitting'];
        }

        return $model;
    }
}
