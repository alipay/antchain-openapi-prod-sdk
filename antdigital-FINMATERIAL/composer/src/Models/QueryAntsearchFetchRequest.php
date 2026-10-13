<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryAntsearchFetchRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'url' => 'url',
        'contentFormat' => 'content_format',
        'timeout' => 'timeout',
    ];
    public function validate() {
        Model::validateRequired('url', $this->url, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->contentFormat) {
            $res['content_format'] = $this->contentFormat;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntsearchFetchRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['content_format'])){
            $model->contentFormat = $map['content_format'];
        }
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
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

    // 需要读取的公开网页 URL。每次请求仅支持一个 URL，协议须为 http 或 https
    /**
     * @var string
     */
    public $url;

    // 正文输出格式：text 或 markdown
    /**
     * @var string
     */
    public $contentFormat;

    // 网页读取最大等待时间，单位为秒，取值范围 1～60；超时后返回 IsSuccess=false 和 ErrorCode=FETCH_TIMEOUT
    /**
     * @var int
     */
    public $timeout;

}
