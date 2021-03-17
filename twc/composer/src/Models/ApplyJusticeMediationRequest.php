<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyJusticeMediationRequest extends Model
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

    // 机构码 由蚂蚁分配
    /**
     * @var string
     */
    public $productCode;

    // 法院代码 由蚂蚁提供
    /**
     * @var string
     */
    public $courtCode;

    // 案件内容 JsonString 格式{"agencyRelations":[],"agents":[],"caseInfo":{},"litigants":{}}
    /**
     * @var string
     */
    public $caseBody;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productCode'       => 'product_code',
        'courtCode'         => 'court_code',
        'caseBody'          => 'case_body',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('courtCode', $this->courtCode, true);
        Model::validateRequired('caseBody', $this->caseBody, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->courtCode) {
            $res['court_code'] = $this->courtCode;
        }
        if (null !== $this->caseBody) {
            $res['case_body'] = $this->caseBody;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyJusticeMediationRequest
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['court_code'])) {
            $model->courtCode = $map['court_code'];
        }
        if (isset($map['case_body'])) {
            $model->caseBody = $map['case_body'];
        }

        return $model;
    }
}
