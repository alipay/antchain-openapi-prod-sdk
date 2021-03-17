<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractWordspositionRequest extends Model
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

    // 文档id
    /**
     * @var string
     */
    public $fileId;

    // 关键字列表，逗号分割；注意要英文的逗号，不能中文逗号；关键字建议不要设置特殊字符，因Adobe无法识别部分符号，某些特殊字符会因解析失败从而导致搜索不到
    /**
     * @var string
     */
    public $keywords;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'keywords'          => 'keywords',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('keywords', $this->keywords, true);
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
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractWordspositionRequest
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
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['keywords'])) {
            $model->keywords = $map['keywords'];
        }

        return $model;
    }
}
