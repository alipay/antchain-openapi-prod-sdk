<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS_SECURITY\Models;

use AlibabaCloud\Tea\Model;

class ContentAddress extends Model
{
    // 123
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isDjangoUrl;

    // 213
    /**
     * @example 123
     *
     * @var string
     */
    public $address;

    // 123
    /**
     * @example 12
     *
     * @var string
     */
    public $httpUrl;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $audioType;
    protected $_name = [
        'isDjangoUrl' => 'is_django_url',
        'address'     => 'address',
        'httpUrl'     => 'http_url',
        'audioType'   => 'audio_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isDjangoUrl) {
            $res['is_django_url'] = $this->isDjangoUrl;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->httpUrl) {
            $res['http_url'] = $this->httpUrl;
        }
        if (null !== $this->audioType) {
            $res['audio_type'] = $this->audioType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentAddress
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_django_url'])) {
            $model->isDjangoUrl = $map['is_django_url'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['http_url'])) {
            $model->httpUrl = $map['http_url'];
        }
        if (isset($map['audio_type'])) {
            $model->audioType = $map['audio_type'];
        }

        return $model;
    }
}
