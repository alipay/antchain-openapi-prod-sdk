<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcLinkUrl extends Model
{
    // 根据传输的操作类型，返回对应的URL地址
    /**
     * @example SQ202301291615023
     *
     * @var string
     */
    public $urlId;

    // 免登场景下，给到开放银行和对公认证中心的链接ID,如果对方没有，没办法以免登的形式进入银行页面。
    /**
     * @example APPL20200826000000250721
     *
     * @var string
     */
    public $h5id;

    // 免登场景下，给到对公认证中心的数据，后续KYB需要拿到这个数据进行校验，否则会无法跳转指定地址。
    /**
     * @example 1
     *
     * @var string
     */
    public $state;
    protected $_name = [
        'urlId' => 'url_id',
        'h5id'  => 'h5id',
        'state' => 'state',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->urlId) {
            $res['url_id'] = $this->urlId;
        }
        if (null !== $this->h5id) {
            $res['h5id'] = $this->h5id;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcLinkUrl
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url_id'])) {
            $model->urlId = $map['url_id'];
        }
        if (isset($map['h5id'])) {
            $model->h5id = $map['h5id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }

        return $model;
    }
}
