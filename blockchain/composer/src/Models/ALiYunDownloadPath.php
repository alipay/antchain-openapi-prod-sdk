<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunDownloadPath extends Model
{
    // client_crt_url
    /**
     * @example client_crt_url
     *
     * @var string
     */
    public $clientCrtUrl;

    // trust_ca_url
    /**
     * @example trust_ca_url
     *
     * @var string
     */
    public $trustCaUrl;

    // ca_crt_url
    /**
     * @example ca_crt_url
     *
     * @var string
     */
    public $caCrtUrl;

    // sdk_url
    /**
     * @example sdk_url
     *
     * @var string
     */
    public $sdkUrl;
    protected $_name = [
        'clientCrtUrl' => 'client_crt_url',
        'trustCaUrl'   => 'trust_ca_url',
        'caCrtUrl'     => 'ca_crt_url',
        'sdkUrl'       => 'sdk_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientCrtUrl) {
            $res['client_crt_url'] = $this->clientCrtUrl;
        }
        if (null !== $this->trustCaUrl) {
            $res['trust_ca_url'] = $this->trustCaUrl;
        }
        if (null !== $this->caCrtUrl) {
            $res['ca_crt_url'] = $this->caCrtUrl;
        }
        if (null !== $this->sdkUrl) {
            $res['sdk_url'] = $this->sdkUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunDownloadPath
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_crt_url'])) {
            $model->clientCrtUrl = $map['client_crt_url'];
        }
        if (isset($map['trust_ca_url'])) {
            $model->trustCaUrl = $map['trust_ca_url'];
        }
        if (isset($map['ca_crt_url'])) {
            $model->caCrtUrl = $map['ca_crt_url'];
        }
        if (isset($map['sdk_url'])) {
            $model->sdkUrl = $map['sdk_url'];
        }

        return $model;
    }
}
