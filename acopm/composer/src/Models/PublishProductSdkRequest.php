<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class PublishProductSdkRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 版本号。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>
    /**
     * @var string
     */
    public $publishVersion;

    // sdk发布请求来源。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>。
    /**
     * @var string
     */
    public $platformOrigin;
    protected $_name = [
        'authToken'      => 'auth_token',
        'prodCode'       => 'prod_code',
        'publishVersion' => 'publish_version',
        'platformOrigin' => 'platform_origin',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('publishVersion', $this->publishVersion, true);
        Model::validateRequired('platformOrigin', $this->platformOrigin, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->publishVersion) {
            $res['publish_version'] = $this->publishVersion;
        }
        if (null !== $this->platformOrigin) {
            $res['platform_origin'] = $this->platformOrigin;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishProductSdkRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['publish_version'])) {
            $model->publishVersion = $map['publish_version'];
        }
        if (isset($map['platform_origin'])) {
            $model->platformOrigin = $map['platform_origin'];
        }

        return $model;
    }
}
