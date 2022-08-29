<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class JudicialFileInfo extends Model
{
    // 文件全名, 包含后缀
    /**
     * @example 文件全名.pdf
     *
     * @var string
     */
    public $fileName;

    // 文件key
    /**
     * @example c3h2g1f3jf12g3123lhfs
     *
     * @var string
     */
    public $fileKey;

    // 文件下载地址
    /**
     * @example http://www.testfile.net/products/TWC/file/downloadurl
     *
     * @var string
     */
    public $downloadUrl;

    // 司法纠纷平台文件类型
    /**
     * @example 文件类型
     *
     * @var string
     */
    public $judicialFileType;
    protected $_name = [
        'fileName'         => 'file_name',
        'fileKey'          => 'file_key',
        'downloadUrl'      => 'download_url',
        'judicialFileType' => 'judicial_file_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->judicialFileType) {
            $res['judicial_file_type'] = $this->judicialFileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudicialFileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['judicial_file_type'])) {
            $model->judicialFileType = $map['judicial_file_type'];
        }

        return $model;
    }
}
