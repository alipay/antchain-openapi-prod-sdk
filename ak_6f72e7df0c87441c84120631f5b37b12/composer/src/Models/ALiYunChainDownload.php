<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainDownload extends Model
{
    // download_path
    /**
     * @example download_path
     *
     * @var ALiYunDownloadPath
     */
    public $downloadPath;

    // private_key
    /**
     * @example private_key
     *
     * @var string
     */
    public $privateKey;
    protected $_name = [
        'downloadPath' => 'download_path',
        'privateKey'   => 'private_key',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->downloadPath) {
            $res['download_path'] = null !== $this->downloadPath ? $this->downloadPath->toMap() : null;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainDownload
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['download_path'])) {
            $model->downloadPath = ALiYunDownloadPath::fromMap($map['download_path']);
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }

        return $model;
    }
}
