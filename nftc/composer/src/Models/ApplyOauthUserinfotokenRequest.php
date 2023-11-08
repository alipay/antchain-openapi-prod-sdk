<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class ApplyOauthUserinfotokenRequest extends Model
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

    // accessToken请求
    /**
     * @var string
     */
    public $accessToken;

    // 拉起页面的场景
    // nft_details 订单详情页
    // oauth_page 授权登陆页
    /**
     * @var string
     */
    public $pageTokenScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accessToken'       => 'access_token',
        'pageTokenScene'    => 'page_token_scene',
    ];

    public function validate()
    {
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('pageTokenScene', $this->pageTokenScene, true);
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
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->pageTokenScene) {
            $res['page_token_scene'] = $this->pageTokenScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyOauthUserinfotokenRequest
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
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['page_token_scene'])) {
            $model->pageTokenScene = $map['page_token_scene'];
        }

        return $model;
    }
}
