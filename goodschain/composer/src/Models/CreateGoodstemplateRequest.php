<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateGoodstemplateRequest extends Model
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

    // 商品名称
    /**
     * @var string
     */
    public $name;

    // 商品定义描述，格式如示例
    /**
     * @var string
     */
    public $content;

    // 联盟id
    /**
     * @var string
     */
    public $leagueId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'content'           => 'content',
        'leagueId'          => 'league_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('leagueId', $this->leagueId, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->leagueId) {
            $res['league_id'] = $this->leagueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateGoodstemplateRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['league_id'])) {
            $model->leagueId = $map['league_id'];
        }

        return $model;
    }
}
