<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktCardsmsSupportRequest extends Model
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

    // 卡片短信模板
    /**
     * @var string
     */
    public $templateCode;

    // 手机号
    /**
     * @var string
     */
    public $mobiles;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cpassAk'           => 'cpass_ak',
        'industryTag'       => 'industry_tag',
        'templateCode'      => 'template_code',
        'mobiles'           => 'mobiles',
    ];

    public function validate()
    {
        Model::validateRequired('industryTag', $this->industryTag, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('mobiles', $this->mobiles, true);
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
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->mobiles) {
            $res['mobiles'] = $this->mobiles;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktCardsmsSupportRequest
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
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['mobiles'])) {
            $model->mobiles = $map['mobiles'];
        }

        return $model;
    }
}
