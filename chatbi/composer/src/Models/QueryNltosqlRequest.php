<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CHATBI\Models;

use AlibabaCloud\Tea\Model;

class QueryNltosqlRequest extends Model
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

    // 用户自然语言输入的问题
    /**
     * @var string
     */
    public $input;

    // 主题ID
    /**
     * @var string
     */
    public $topicid;

    // 对话ID
    /**
     * @var string
     */
    public $dialogid;

    // 来源系统
    /**
     * @var string
     */
    public $source;

    // 是否需要返回SQL执行结果
    /**
     * @var bool
     */
    public $needsqlexecuteresult;

    // 是否限制返回条数
    /**
     * @var bool
     */
    public $limit;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'input'                => 'input',
        'topicid'              => 'topicid',
        'dialogid'             => 'dialogid',
        'source'               => 'source',
        'needsqlexecuteresult' => 'needsqlexecuteresult',
        'limit'                => 'limit',
    ];

    public function validate()
    {
        Model::validateRequired('input', $this->input, true);
        Model::validateRequired('topicid', $this->topicid, true);
        Model::validateRequired('dialogid', $this->dialogid, true);
        Model::validateRequired('source', $this->source, true);
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
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }
        if (null !== $this->topicid) {
            $res['topicid'] = $this->topicid;
        }
        if (null !== $this->dialogid) {
            $res['dialogid'] = $this->dialogid;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->needsqlexecuteresult) {
            $res['needsqlexecuteresult'] = $this->needsqlexecuteresult;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNltosqlRequest
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
        if (isset($map['input'])) {
            $model->input = $map['input'];
        }
        if (isset($map['topicid'])) {
            $model->topicid = $map['topicid'];
        }
        if (isset($map['dialogid'])) {
            $model->dialogid = $map['dialogid'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['needsqlexecuteresult'])) {
            $model->needsqlexecuteresult = $map['needsqlexecuteresult'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }

        return $model;
    }
}
