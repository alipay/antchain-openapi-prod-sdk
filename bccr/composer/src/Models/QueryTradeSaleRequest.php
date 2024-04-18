<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryTradeSaleRequest extends Model
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

    // 查询文本
    /**
     * @var string
     */
    public $queryText;

    // 查询场景
    /**
     * @var string
     */
    public $queryScene;

    // 扩展信息，JSON格式
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'queryText'         => 'query_text',
        'queryScene'        => 'query_scene',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('queryText', $this->queryText, true);
        Model::validateRequired('queryScene', $this->queryScene, true);
        Model::validateMaxLength('queryText', $this->queryText, 2048);
        Model::validateMinLength('queryText', $this->queryText, 0);
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
        if (null !== $this->queryText) {
            $res['query_text'] = $this->queryText;
        }
        if (null !== $this->queryScene) {
            $res['query_scene'] = $this->queryScene;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTradeSaleRequest
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
        if (isset($map['query_text'])) {
            $model->queryText = $map['query_text'];
        }
        if (isset($map['query_scene'])) {
            $model->queryScene = $map['query_scene'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
