<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models;

use AlibabaCloud\Tea\Model;

class ALiYunDownloadPath extends Model
{
    // ca_crt_url
    /**
     * @example ca_crt_url
     *
     * @var string
     */
    public $caCrtUrl;

    // client_crt_url
    /**
     * @example client_crt_url
     *
     * @var string
     */
    public $clientCrtUrl;

    // sdk_url
    /**
     * @example sdk_url
     *
     * @var string
     */
    public $sdkUrl;

    // trust_ca_url
    /**
     * @example trust_ca_url
     *
     * @var string
     */
    public $trustCaUrl;
    protected $_name = [
        'caCrtUrl'     => 'ca_crt_url',
        'clientCrtUrl' => 'client_crt_url',
        'sdkUrl'       => 'sdk_url',
        'trustCaUrl'   => 'trust_ca_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->caCrtUrl) {
            $res['ca_crt_url'] = $this->caCrtUrl;
        }
        if (null !== $this->clientCrtUrl) {
            $res['client_crt_url'] = $this->clientCrtUrl;
        }
        if (null !== $this->sdkUrl) {
            $res['sdk_url'] = $this->sdkUrl;
        }
        if (null !== $this->trustCaUrl) {
            $res['trust_ca_url'] = $this->trustCaUrl;
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
        if (isset($map['ca_crt_url'])) {
            $model->caCrtUrl = $map['ca_crt_url'];
        }
        if (isset($map['client_crt_url'])) {
            $model->clientCrtUrl = $map['client_crt_url'];
        }
        if (isset($map['sdk_url'])) {
            $model->sdkUrl = $map['sdk_url'];
        }
        if (isset($map['trust_ca_url'])) {
            $model->trustCaUrl = $map['trust_ca_url'];
        }

        return $model;
    }
}
