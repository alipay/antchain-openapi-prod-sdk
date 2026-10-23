<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class PushAdvisormarketAnalysisRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'analysisType' => 'analysis_type',
        'input' => 'input',
    ];
    public function validate() {
        Model::validateRequired('analysisType', $this->analysisType, true);
        Model::validateRequired('input', $this->input, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->analysisType) {
            $res['analysis_type'] = $this->analysisType;
        }
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushAdvisormarketAnalysisRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['analysis_type'])){
            $model->analysisType = $map['analysis_type'];
        }
        if(isset($map['input'])){
            $model->input = $map['input'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 分析能力标识。当前仅支持 YINLI_CROWD_ANALYSIS。
    /**
     * @var string
     */
    public $analysisType;

    // UTF-8 JSON 对象字符串，禁止二次编码。示例：{"city":"深圳","time_range":{"start_date":"2026-09-01","end_date":"2026-09-30"},"business_area":{"name":"中心商圈","aoi":{"geometry":{"type":"Polygon","coordinates":[[[114,22],[115,22],[114,23],[114,22]]]}},"reachable_aoi":{"geometry":{"type":"Polygon","coordinates":[[[113,21],[116,21],[113,24],[113,21]]]}}},"audience_path":"/a.txt.pgp"}。日期格式为 YYYY-MM-DD；两个 coordinates 均为闭合的 GeoJSON Polygon；audience_path 必须以 .txt.pgp 结尾。
    /**
     * @var string
     */
    public $input;

}
