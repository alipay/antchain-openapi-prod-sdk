<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerFunddividerelationRequest extends Model
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

    // 租户8位id
    /**
     * @var string
     */
    public $tenantId;

    // 第一次暂存或提交可以不传，由后端生成
    /**
     * @var string
     */
    public $relationId;

    // 分账公司名称
    /**
     * @var string
     */
    public $companyName;

    // 分账公司社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 分账合同或协议
    /**
     * @var FileInfo[]
     */
    public $contractFiles;

    // 分账关系说明
    /**
     * @var string
     */
    public $desc;

    // 分账方企业pid
    /**
     * @var string
     */
    public $alipayPid;

    // 分账方企业支付宝账号
    /**
     * @var string
     */
    public $alipayAccount;

    // 是否直接提交
    // SUBMITTED 直接提交
    // STAGE 暂存
    /**
     * @var string
     */
    public $submit;

    // 操作人名称
    /**
     * @var string
     */
    public $userName;

    // 商户公司社会统一信用代码,
    // 如果expandMode=AGENT, 非空，长度不超过32位
    /**
     * @var string
     */
    public $subjectMerchantId;

    // 进件模式	:DIRECT(直连进件) ,AGENT(代理进件)
    // 默认值：DIRECT
    /**
     * @var string
     */
    public $expandMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'relationId'        => 'relation_id',
        'companyName'       => 'company_name',
        'merchantId'        => 'merchant_id',
        'contractFiles'     => 'contract_files',
        'desc'              => 'desc',
        'alipayPid'         => 'alipay_pid',
        'alipayAccount'     => 'alipay_account',
        'submit'            => 'submit',
        'userName'          => 'user_name',
        'subjectMerchantId' => 'subject_merchant_id',
        'expandMode'        => 'expand_mode',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('submit', $this->submit, true);
        Model::validateRequired('userName', $this->userName, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->relationId) {
            $res['relation_id'] = $this->relationId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->contractFiles) {
            $res['contract_files'] = [];
            if (null !== $this->contractFiles && \is_array($this->contractFiles)) {
                $n = 0;
                foreach ($this->contractFiles as $item) {
                    $res['contract_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->alipayPid) {
            $res['alipay_pid'] = $this->alipayPid;
        }
        if (null !== $this->alipayAccount) {
            $res['alipay_account'] = $this->alipayAccount;
        }
        if (null !== $this->submit) {
            $res['submit'] = $this->submit;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->subjectMerchantId) {
            $res['subject_merchant_id'] = $this->subjectMerchantId;
        }
        if (null !== $this->expandMode) {
            $res['expand_mode'] = $this->expandMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerFunddividerelationRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['relation_id'])) {
            $model->relationId = $map['relation_id'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['contract_files'])) {
            if (!empty($map['contract_files'])) {
                $model->contractFiles = [];
                $n                    = 0;
                foreach ($map['contract_files'] as $item) {
                    $model->contractFiles[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['alipay_pid'])) {
            $model->alipayPid = $map['alipay_pid'];
        }
        if (isset($map['alipay_account'])) {
            $model->alipayAccount = $map['alipay_account'];
        }
        if (isset($map['submit'])) {
            $model->submit = $map['submit'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['subject_merchant_id'])) {
            $model->subjectMerchantId = $map['subject_merchant_id'];
        }
        if (isset($map['expand_mode'])) {
            $model->expandMode = $map['expand_mode'];
        }

        return $model;
    }
}
