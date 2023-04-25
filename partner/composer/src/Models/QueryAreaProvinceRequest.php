<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryAreaProvinceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 省份, 空:全部省份, 不为空筛选关键字省份
    /**
     * @var string
     */
    public $province;

    // 租户来源-用于租户间功能和数据的隔离
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken' => 'auth_token',
        'province'  => 'province',
        'source'    => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAreaProvinceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
