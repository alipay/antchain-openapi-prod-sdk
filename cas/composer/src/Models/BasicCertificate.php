<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BasicCertificate extends Model
{
    // serverCertificateId
    /**
     * @example serverCertificateId
     *
     * @var string
     */
    public $serverCertificateId;

    // serverCertificateName
    /**
     * @example serverCertificateName
     *
     * @var string
     */
    public $serverCertificateName;

    // fingerprint
    /**
     * @example fingerprint
     *
     * @var string
     */
    public $fingerprint;

    // cert_type
    /**
     * @example
     *
     * @var int
     */
    public $certType;
    protected $_name = [
        'serverCertificateId'   => 'server_certificate_id',
        'serverCertificateName' => 'server_certificate_name',
        'fingerprint'           => 'fingerprint',
        'certType'              => 'cert_type',
    ];

    public function validate()
    {
        Model::validateRequired('serverCertificateId', $this->serverCertificateId, true);
        Model::validateRequired('serverCertificateName', $this->serverCertificateName, true);
        Model::validateRequired('certType', $this->certType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serverCertificateId) {
            $res['server_certificate_id'] = $this->serverCertificateId;
        }
        if (null !== $this->serverCertificateName) {
            $res['server_certificate_name'] = $this->serverCertificateName;
        }
        if (null !== $this->fingerprint) {
            $res['fingerprint'] = $this->fingerprint;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BasicCertificate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['server_certificate_id'])) {
            $model->serverCertificateId = $map['server_certificate_id'];
        }
        if (isset($map['server_certificate_name'])) {
            $model->serverCertificateName = $map['server_certificate_name'];
        }
        if (isset($map['fingerprint'])) {
            $model->fingerprint = $map['fingerprint'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }

        return $model;
    }
}
