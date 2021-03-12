<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainDownload extends Model
{
    // private_key
    /**
     * @example private_key
     *
     * @var string
     */
    public $privateKey;

    // download_path
    /**
     * @example download_path
     *
     * @var ALiYunDownloadPath
     */
    public $downloadPath;
    protected $_name = [
        'privateKey'   => 'private_key',
        'downloadPath' => 'download_path',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->downloadPath) {
            $res['download_path'] = null !== $this->downloadPath ? $this->downloadPath->toMap() : null;
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
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['download_path'])) {
            $model->downloadPath = ALiYunDownloadPath::fromMap($map['download_path']);
        }

        return $model;
    }
}
