<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveTrailerCorpRequest extends Model
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

    // 企业名称
    /**
     * @var string
     */
    public $companyName;

    // 企业统一社会信用代码
    /**
     * @var string
     */
    public $socialCreditCode;

    // 渠道企业名称
    /**
     * @var string
     */
    public $channelCompanyName;

    // 渠道企业信用代码
    /**
     * @var string
     */
    public $channelSocialCreditCode;

    // 企业入驻渠道日期
    /**
     * @var string
     */
    public $entryDate;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'companyName'             => 'company_name',
        'socialCreditCode'        => 'social_credit_code',
        'channelCompanyName'      => 'channel_company_name',
        'channelSocialCreditCode' => 'channel_social_credit_code',
        'entryDate'               => 'entry_date',
    ];

    public function validate()
    {
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('channelCompanyName', $this->channelCompanyName, true);
        Model::validateRequired('channelSocialCreditCode', $this->channelSocialCreditCode, true);
        Model::validateRequired('entryDate', $this->entryDate, true);
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
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }
        if (null !== $this->channelCompanyName) {
            $res['channel_company_name'] = $this->channelCompanyName;
        }
        if (null !== $this->channelSocialCreditCode) {
            $res['channel_social_credit_code'] = $this->channelSocialCreditCode;
        }
        if (null !== $this->entryDate) {
            $res['entry_date'] = $this->entryDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveTrailerCorpRequest
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
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }
        if (isset($map['channel_company_name'])) {
            $model->channelCompanyName = $map['channel_company_name'];
        }
        if (isset($map['channel_social_credit_code'])) {
            $model->channelSocialCreditCode = $map['channel_social_credit_code'];
        }
        if (isset($map['entry_date'])) {
            $model->entryDate = $map['entry_date'];
        }

        return $model;
    }
}
