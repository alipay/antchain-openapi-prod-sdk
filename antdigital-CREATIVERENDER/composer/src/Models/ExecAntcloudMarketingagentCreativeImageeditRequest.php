<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class ExecAntcloudMarketingagentCreativeImageeditRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productCode' => 'product_code',
        'segmentVersionId' => 'segment_version_id',
        'prompt' => 'prompt',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('segmentVersionId', $this->segmentVersionId, true);
        Model::validateRequired('prompt', $this->prompt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->segmentVersionId) {
            $res['segment_version_id'] = $this->segmentVersionId;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentCreativeImageeditRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['segment_version_id'])){
            $model->segmentVersionId = $map['segment_version_id'];
        }
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品代码，当前仅支持 FUND（基金）。
    /**
     * @var string
     */
    public $productCode;

    // 来源子图成功版本 ID，必须属于当前调用用户及租户；可使用子图列表中的成功版本或上一轮编辑成功返回的新版本。
    /**
     * @var string
     */
    public $segmentVersionId;

    // 本轮图片修改要求，不能为空。源图和输出宽高由服务端根据来源版本解析。
    /**
     * @var string
     */
    public $prompt;

}
