<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class ExecApiAuthtemplateRequest extends Model
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

    // token
    /**
     * @var string
     */
    public $token;

    // 树的模版id
    /**
     * @var string
     */
    public $treeTemplateId;

    // 模版对应的版本号
    /**
     * @var string
     */
    public $treeVersion;

    // 对应节点ID
    /**
     * @var string
     */
    public $nodeId;

    // 当前卡片所有需要填充元素key
    // 和value值
    /**
     * @var Pair
     */
    public $pairs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'token'             => 'token',
        'treeTemplateId'    => 'tree_template_id',
        'treeVersion'       => 'tree_version',
        'nodeId'            => 'node_id',
        'pairs'             => 'pairs',
    ];

    public function validate()
    {
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('treeTemplateId', $this->treeTemplateId, true);
        Model::validateRequired('treeVersion', $this->treeVersion, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('pairs', $this->pairs, true);
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->treeTemplateId) {
            $res['tree_template_id'] = $this->treeTemplateId;
        }
        if (null !== $this->treeVersion) {
            $res['tree_version'] = $this->treeVersion;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->pairs) {
            $res['pairs'] = null !== $this->pairs ? $this->pairs->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecApiAuthtemplateRequest
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['tree_template_id'])) {
            $model->treeTemplateId = $map['tree_template_id'];
        }
        if (isset($map['tree_version'])) {
            $model->treeVersion = $map['tree_version'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['pairs'])) {
            $model->pairs = Pair::fromMap($map['pairs']);
        }

        return $model;
    }
}
