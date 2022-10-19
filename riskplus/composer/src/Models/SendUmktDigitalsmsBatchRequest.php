<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SendUmktDigitalsmsBatchRequest extends Model
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

    // cpassAccessKey
    /**
     * @var string
     */
    public $cpassAk;

    // 行业标签
    /**
     * @var string
     */
    public $industryTag;

    // 手机号列表以,分隔
    /**
     * @var string
     */
    public $phoneNumbers;

    // 数字短信模板code
    /**
     * @var string
     */
    public $templateCode;

    // 短信模板参数
    /**
     * @var string
     */
    public $templateParam;

    // 透传字段
    /**
     * @var string
     */
    public $outId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cpassAk'           => 'cpass_ak',
        'industryTag'       => 'industry_tag',
        'phoneNumbers'      => 'phone_numbers',
        'templateCode'      => 'template_code',
        'templateParam'     => 'template_param',
        'outId'             => 'out_id',
    ];

    public function validate()
    {
        Model::validateRequired('industryTag', $this->industryTag, true);
        Model::validateRequired('phoneNumbers', $this->phoneNumbers, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateParam', $this->templateParam, true);
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
        if (null !== $this->cpassAk) {
            $res['cpass_ak'] = $this->cpassAk;
        }
        if (null !== $this->industryTag) {
            $res['industry_tag'] = $this->industryTag;
        }
        if (null !== $this->phoneNumbers) {
            $res['phone_numbers'] = $this->phoneNumbers;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateParam) {
            $res['template_param'] = $this->templateParam;
        }
        if (null !== $this->outId) {
            $res['out_id'] = $this->outId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendUmktDigitalsmsBatchRequest
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
        if (isset($map['cpass_ak'])) {
            $model->cpassAk = $map['cpass_ak'];
        }
        if (isset($map['industry_tag'])) {
            $model->industryTag = $map['industry_tag'];
        }
        if (isset($map['phone_numbers'])) {
            $model->phoneNumbers = $map['phone_numbers'];
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['template_param'])) {
            $model->templateParam = $map['template_param'];
        }
        if (isset($map['out_id'])) {
            $model->outId = $map['out_id'];
        }

        return $model;
    }
}
