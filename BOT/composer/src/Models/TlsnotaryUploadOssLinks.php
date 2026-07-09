<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TlsnotaryUploadOssLinks extends Model
{
    // 证书链摘要文件的oss链接
    /**
     * @example tlsnotary/{taskId}.json
     *
     * @var string
     */
    public $certChainDigestLink;

    // 邮件eml文件的oss链接
    /**
     * @example tlsnotary/{taskId}.eml
     *
     * @var string
     */
    public $emlFileLink;
    protected $_name = [
        'certChainDigestLink' => 'cert_chain_digest_link',
        'emlFileLink'         => 'eml_file_link',
    ];

    public function validate()
    {
        Model::validateRequired('certChainDigestLink', $this->certChainDigestLink, true);
        Model::validateRequired('emlFileLink', $this->emlFileLink, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certChainDigestLink) {
            $res['cert_chain_digest_link'] = $this->certChainDigestLink;
        }
        if (null !== $this->emlFileLink) {
            $res['eml_file_link'] = $this->emlFileLink;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TlsnotaryUploadOssLinks
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_chain_digest_link'])) {
            $model->certChainDigestLink = $map['cert_chain_digest_link'];
        }
        if (isset($map['eml_file_link'])) {
            $model->emlFileLink = $map['eml_file_link'];
        }

        return $model;
    }
}
